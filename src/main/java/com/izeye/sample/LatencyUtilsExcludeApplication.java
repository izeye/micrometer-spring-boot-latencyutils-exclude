package com.izeye.sample;

import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import java.time.Duration;

/**
 * Main class.
 *
 * @author Johnny Lim
 */
public class LatencyUtilsExcludeApplication {

    public static void main(String[] args) {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        Timer timer = Timer.builder("my.timer").register(registry);
        timer.record(Duration.ofSeconds(1L));
        System.out.println(timer.count());
    }

}
