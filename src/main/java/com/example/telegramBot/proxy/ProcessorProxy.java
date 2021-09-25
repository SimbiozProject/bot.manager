package com.example.telegramBot.proxy;

import com.example.telegramBot.dto.HelloMessageDto;
import com.example.telegramBot.dto.UserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@FeignClient(value = "bot-processor", url = "http://localhost:8091")
public interface ProcessorProxy {

  @PostMapping("/home-page")
  HelloMessageDto sendMessage(UserInfoDto userInfoDto);
}