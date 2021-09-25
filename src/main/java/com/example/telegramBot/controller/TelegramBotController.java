package com.example.telegramBot.controller;

import com.example.telegramBot.bot.TelegramBot;
import com.example.telegramBot.service.SendBotMessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
@AllArgsConstructor
public class TelegramBotController {

  private final TelegramBot telegramBot;
  private final SendBotMessageService sendBotMessageService;

  @PostMapping("/update")
  public void onUpdateReceived(@RequestBody Update update) {
    telegramBot.onUpdateReceived(update);
  }

  @PostMapping("/sendMessage")
  public void sendMessage(@RequestParam String chatId,@RequestParam String message) {
    sendBotMessageService.sendMessage(chatId, message);
  }
}
