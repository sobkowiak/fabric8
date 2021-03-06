/**
 *  Copyright 2005-2015 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.kubernetes.api.builds;

import io.fabric8.utils.Strings;

public class Links {

    private static final String DEFAULT_FABRIC8_CONSOLE = "http://fabric8.local/";

    public static String getFabric8ConsoleLink() {
        String answer = System.getenv("FABRIC8_CONSOLE");
        if (Strings.isNullOrBlank(answer)) {
            answer = DEFAULT_FABRIC8_CONSOLE;
        }
        return answer;
    }
}
