package com.github.junghanchoi.duckingidea.services

import com.intellij.openapi.project.Project
import com.github.junghanchoi.duckingidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
