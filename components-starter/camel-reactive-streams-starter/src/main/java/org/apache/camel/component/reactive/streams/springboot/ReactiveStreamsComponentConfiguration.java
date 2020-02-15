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
package org.apache.camel.component.reactive.streams.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy;
import org.apache.camel.component.reactive.streams.ReactiveStreamsComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Reactive Camel using reactive streams
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.reactive-streams")
public class ReactiveStreamsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the reactive-streams component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * The backpressure strategy to use when pushing events to a slow
     * subscriber.
     */
    private ReactiveStreamsBackpressureStrategy backpressureStrategy = ReactiveStreamsBackpressureStrategy.BUFFER;
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
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Configures the internal engine for Reactive Streams.
     */
    private ReactiveStreamsEngineConfigurationNestedConfiguration internalEngineConfiguration;
    /**
     * Set the type of the underlying reactive streams implementation to use.
     * The implementation is looked up from the registry or using a
     * ServiceLoader, the default implementation is
     * DefaultCamelReactiveStreamsService
     */
    private String serviceType;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public ReactiveStreamsBackpressureStrategy getBackpressureStrategy() {
        return backpressureStrategy;
    }

    public void setBackpressureStrategy(
            ReactiveStreamsBackpressureStrategy backpressureStrategy) {
        this.backpressureStrategy = backpressureStrategy;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public ReactiveStreamsEngineConfigurationNestedConfiguration getInternalEngineConfiguration() {
        return internalEngineConfiguration;
    }

    public void setInternalEngineConfiguration(
            ReactiveStreamsEngineConfigurationNestedConfiguration internalEngineConfiguration) {
        this.internalEngineConfiguration = internalEngineConfiguration;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public static class ReactiveStreamsEngineConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class;
        /**
         * The maximum number of threads used by the reactive streams internal
         * engine.
         */
        private Integer threadPoolMaxSize;
        /**
         * The minimum number of threads used by the reactive streams internal
         * engine.
         */
        private Integer threadPoolMinSize;
        /**
         * The name of the thread pool used by the reactive streams internal
         * engine.
         */
        private String threadPoolName;

        public Integer getThreadPoolMaxSize() {
            return threadPoolMaxSize;
        }

        public void setThreadPoolMaxSize(Integer threadPoolMaxSize) {
            this.threadPoolMaxSize = threadPoolMaxSize;
        }

        public Integer getThreadPoolMinSize() {
            return threadPoolMinSize;
        }

        public void setThreadPoolMinSize(Integer threadPoolMinSize) {
            this.threadPoolMinSize = threadPoolMinSize;
        }

        public String getThreadPoolName() {
            return threadPoolName;
        }

        public void setThreadPoolName(String threadPoolName) {
            this.threadPoolName = threadPoolName;
        }
    }
}