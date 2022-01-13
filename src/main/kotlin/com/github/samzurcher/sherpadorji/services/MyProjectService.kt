package com.github.samzurcher.sherpadorji.services

import com.intellij.openapi.project.Project
import com.github.samzurcher.sherpadorji.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
