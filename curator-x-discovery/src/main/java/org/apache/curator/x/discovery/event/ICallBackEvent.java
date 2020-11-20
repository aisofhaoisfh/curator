package org.apache.curator.x.discovery.event;

import org.apache.curator.x.discovery.ServiceInstance;

public interface ICallBackEvent {

    void onEvent(EventTypes eventType, ServiceInstance serviceInstance);

}
