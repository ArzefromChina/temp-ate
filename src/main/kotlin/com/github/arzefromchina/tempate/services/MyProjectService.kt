package com.github.arzefromchina.tempate.services

import com.intellij.openapi.project.Project
import com.github.arzefromchina.tempate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
