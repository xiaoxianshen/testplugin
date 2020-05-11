package com.unit.testplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class NoTracePointPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        if(project.hasProperty("android")){
            project.android.registerTransform(new NoTracePointPluginParam(project))
        }
    }

}