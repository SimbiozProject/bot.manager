package com.example.telegramBot.user.command.commands;

import com.example.telegramBot.dto.HelloMessageDto;
import com.example.telegramBot.dto.UserInfoDto;
import com.example.telegramBot.proxy.ProcessorProxy;
import com.example.telegramBot.service.SendBotMessageService;
import com.example.telegramBot.user.keyboard.inline.UserInlineKeyboardSource;

import com.example.telegramBot.repository.entity.StatisticUser;
import com.example.telegramBot.service.StatisticUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;

@AllArgsConstructor
@Service
public class MainMenuComm implements Command {

//    private final UserInlineKeyboardSource userInlineKeyboardSource = new UserInlineKeyboardSource();
//
//    public final static String MAIN_MENU_MESSAGE = "Здравствуйте, если вы это читаете значит вы решили выучить английски, а мы, WorldLand, поможем Вам в этом!";
//    private final ReplyKeyboard mainMenuKeyboard = userInlineKeyboardSource.getMainMenuKeyboard();

//    private final SendBotMessageService sendBotMessageService;
//    private final StatisticUserService statisticUserService;
    private final ProcessorProxy processorProxy;
    private final SendBotMessageService sendBotMessageService;


        @Override
    public void execute(Update update) {
            Long chatId = update.getMessage().getChatId();
            String userName = update.getMessage().getFrom().getUserName();
            UserInfoDto userInfoDto = new UserInfoDto(chatId, userName);
            HelloMessageDto helloMessageDto = processorProxy.sendMessage(userInfoDto);

            sendBotMessageService.sendMessage(
                helloMessageDto.getUserProfile().getChatId().toString(),
                helloMessageDto.getMessage());
    }
//
//    @Override
//    public void execute(Update update) {
//        Long chatId = update.getMessage().getChatId();
//        statisticUserService.findByChatId(chatId).ifPresentOrElse(
//                user -> {user.setActive(true);
//                statisticUserService.save(user);
//                },
//                () -> {
//                    StatisticUser statisticUser = new StatisticUser();
//                    statisticUser.setActive(true);
//                    statisticUser.setChatId(chatId);
//                    statisticUserService.save(statisticUser);
//                }
//        );
//
//        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), MAIN_MENU_MESSAGE, mainMenuKeyboard);
//
//
//    }
}
