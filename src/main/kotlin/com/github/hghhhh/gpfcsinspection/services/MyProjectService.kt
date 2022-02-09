package com.github.hghhhh.gpfcsinspection.services

import com.intellij.openapi.project.Project
import com.github.hghhhh.gpfcsinspection.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
