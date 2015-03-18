package org.seasar.sastruts.example.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class UserDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public long userId;
	public String userName;
}
