package com.github.hotire.springmongodb

import de.flapdoodle.embed.mongo.config.MongodConfig
import de.flapdoodle.embed.mongo.config.Net
import de.flapdoodle.embed.mongo.distribution.Version
import de.flapdoodle.embed.process.runtime.Network
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LocalMongodbConfig {

    @Bean
    fun mongodConfig(): MongodConfig {
        return MongodConfig
            .builder()
            .version(Version.Main.PRODUCTION)
            .net(Net("localhost", 27017, Network.localhostIsIPv6()))
            .build()
    }
}
