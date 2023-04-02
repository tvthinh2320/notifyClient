package org.notifyClient.service.impl;

import org.notifyClient.dto.Request;
import org.notifyClient.service.NotifyClientService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class NotifyClientServiceImpl implements NotifyClientService {

    @Override
    public boolean notify(Request request) {
        if( request.getReqCode().isBlank() ||
                request.getWbCode().isBlank()  ||
                request.getNotifyTyp().isBlank() ||
                Objects.isNull(request.getData())
        ){
            return false;
        }
        return true;
    }
}
