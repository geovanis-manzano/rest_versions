package com.gmanzano.rest_versions.url_path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLPathController {

    @GetMapping("/v1/endpoint")
    public String getV1() {
        return "v1";
    }

    @GetMapping("/v2/endpoint")
    public String getV2() {
        return "v2";
    }
}
