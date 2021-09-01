package com.github.njari.springpropertyvalidator.services

import com.github.njari.springpropertyvalidator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
