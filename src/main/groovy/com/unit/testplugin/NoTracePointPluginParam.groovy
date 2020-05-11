package com.unit.testplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class NoTracePointPluginParam implements Plugin<Project>{

    @Override
    void apply(Project project) {
        if(project.hasProperty("android")){
            System.out.println("========================");
            System.out.println("hello gradle plugin!");
            System.out.println("========================");
        }
    }

}