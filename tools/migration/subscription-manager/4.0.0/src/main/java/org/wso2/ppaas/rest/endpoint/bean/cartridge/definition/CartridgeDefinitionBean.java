/*
 * Copyright (c) 2005-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.ppaas.rest.endpoint.bean.cartridge.definition;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "cartridgeDefinitionBean") public class CartridgeDefinitionBean {

    public String type;

    public String host;

    public String provider;

    public String displayName;

    public String description;

    public String version;

    public boolean multiTenant;

    public DeploymentBean deployment;

    public List<PortMappingBean> portMapping;

    public PersistenceBean persistence;

    public List<IaasProviderBean> iaasProvider;

    public LoadBalancerBean loadBalancer;

    public List<PropertyBean> property;

    public String defaultAutoscalingPolicy;

    public String defaultDeploymentPolicy;

    public String serviceGroup;

    public String toString() {

        return "Type: " + type + ", Provider: " + provider + ", Host: " + host + ", Display Name: " + displayName +
                ", Description: " + description + ", Version: " + version + ", Multitenant " + multiTenant + "\n" +
                getDeploymentDetails() + "\n PortMapping: " + getPortMappings() + "\n IaaS: " + getIaasProviders() +
                "\n LoadBalancer: " + getLoadBalancerInfo() + "\n Properties: " + getProperties()
                + "\n VolumeBean mappings " + persistence.toString();
    }

    private String getDeploymentDetails() {

        if (deployment != null) {
            return deployment.toString();
        }
        return null;
    }

    private String getLoadBalancerInfo() {

        if (loadBalancer != null) {
            return loadBalancer.toString();
        }
        return null;
    }

    private String getPortMappings() {

        StringBuilder portMappingBuilder = new StringBuilder();
        if (portMapping != null && !portMapping.isEmpty()) {
            for (PortMappingBean portMappingBean : portMapping) {
                portMappingBuilder.append(portMappingBean.toString());
            }
        }
        return portMappingBuilder.toString();
    }

    private String getIaasProviders() {

        StringBuilder iaasBuilder = new StringBuilder();
        if (iaasProvider != null && !iaasProvider.isEmpty()) {
            for (IaasProviderBean iaasProviderBean : iaasProvider) {
                iaasBuilder.append(iaasProviderBean.toString());
            }
        }
        return iaasBuilder.toString();
    }

    private String getProperties() {

        StringBuilder propertyBuilder = new StringBuilder();
        if (property != null) {
            for (PropertyBean propertyBean : property) {
                propertyBuilder.append(propertyBean.name + " : " + propertyBean.value + " | ");
            }
        }
        return propertyBuilder.toString();
    }
}
