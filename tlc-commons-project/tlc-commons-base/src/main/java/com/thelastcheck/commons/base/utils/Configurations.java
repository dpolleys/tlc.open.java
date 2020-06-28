/*******************************************************************************
 * Copyright (c) 2009-2015 The Last Check, LLC, All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.thelastcheck.commons.base.utils;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Configurations {

    /**
     * static factory method for building properties files with no checked exception thrown
     *
     * @param fileName
     * @return
     */
    public static Configuration createConfigFromProperties(String fileName) {
        try {
            PropertiesConfiguration.setDefaultListDelimiter('|');
            PropertiesConfiguration config = new PropertiesConfiguration(fileName);
            config.setThrowExceptionOnMissing(true);
            return config;
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

}