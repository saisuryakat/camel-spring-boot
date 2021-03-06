/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.lucene.springboot;

import java.io.File;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To insert or query from Apache Lucene databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.lucene")
public class LuceneComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the lucene component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * An Analyzer builds TokenStreams, which analyze text. It thus represents a
     * policy for extracting index terms from text. The value for analyzer can
     * be any class that extends the abstract class
     * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
     * analyzers out of the box. The option is a
     * org.apache.lucene.analysis.Analyzer type.
     */
    private String analyzer;
    /**
     * A file system directory in which index files are created upon analysis of
     * the document by the specified analyzer
     */
    private File indexDir;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * An integer value that limits the result set of the search operation
     */
    private Integer maxHits;
    /**
     * An optional directory containing files to be used to be analyzed and
     * added to the index at producer startup.
     */
    private File srcDir;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * To use a shared lucene configuration. The option is a
     * org.apache.camel.component.lucene.LuceneConfiguration type.
     */
    private String config;

    public String getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
    }

    public File getIndexDir() {
        return indexDir;
    }

    public void setIndexDir(File indexDir) {
        this.indexDir = indexDir;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Integer getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }

    public File getSrcDir() {
        return srcDir;
    }

    public void setSrcDir(File srcDir) {
        this.srcDir = srcDir;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}