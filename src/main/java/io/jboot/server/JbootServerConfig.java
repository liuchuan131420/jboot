/**
 * Copyright (c) 2015-2017, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.server;

import io.jboot.config.annotation.PropertieConfig;


@PropertieConfig(prefix = "jboot.server")
public class JbootServerConfig {

    private String type = "undertow";
    private String host = "0.0.0.0";
    private String port = "8088";
    private String contextPath = "/";


    public String getPort() {
        return port;
    }

    public int getPortAsInt() {
        return Integer.valueOf(port);
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public String toString() {
        return "JbootServerConfig {" +
                "type='" + type + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", contextPath='" + contextPath + '\'' +
                '}';
    }
}
