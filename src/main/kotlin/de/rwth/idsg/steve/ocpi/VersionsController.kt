package de.rwth.idsg.steve.ocpi

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class VersionsController {

    @GetMapping("/ocpi/versions")
    fun getVersions() = "here are the versions"

}
