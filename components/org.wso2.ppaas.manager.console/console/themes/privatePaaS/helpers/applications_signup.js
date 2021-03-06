/*
 * Copyright (c) 2005-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
 
var resources = function (page, meta) {
    return {
        js: ['JSONEditor-0.7.12/jsoneditor-0.7.12.js','bootstrap-switch-3.0.2/bootstrap-switch.min.js', 'custom/script.js','custom/form.js',
            'jquery.contextMenu/jquery.contextMenu.js', 'jquery.contextMenu/jquery.ui.position.js', 'jsplumb-1.7.2/dom.jsPlumb-1.7.2-min.js',
            'dagre-v0.7.0/dagre.min.js','custom/applications-signup.js'],
        css: ['bootstrap-switch-3.0.2/bootstrap-switch.min.css', 'custom/style.css', 'custom/applications_signup.css']
    };
};
