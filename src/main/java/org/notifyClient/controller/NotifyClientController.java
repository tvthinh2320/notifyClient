package org.notifyClient.controller;

import lombok.RequiredArgsConstructor;
import org.notifyClient.dto.Request;
import org.notifyClient.dto.Response;
import org.notifyClient.service.NotifyClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifyClient")
@RequiredArgsConstructor
public class NotifyClientController {

    private final NotifyClientService notifyClientService;

    @PostMapping
    public ResponseEntity<Response> notifyClient(@RequestBody Request request){
        boolean flag = notifyClientService.notify(request);
        if(flag) {
            Response response = new Response();
            response.setCode("0");
            response.setMessage("Successful");
            response.setReqCode(request.getReqCode());
            return ResponseEntity.ok(response);

        }
        Response response = new Response();
        response.setCode("1");
        response.setMessage("Failed");
        response.setReqCode(request.getReqCode());
        return ResponseEntity.ok(response);

    }
}
