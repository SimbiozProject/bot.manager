package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.objects.Update;

@SpringBootTest
public class BaseSpringTest {
  static ObjectMapper objectMapper = new ObjectMapper();

  public static final String START = "src/test/resources/commands/update_start.json";

  public static Update readCommand(String path) throws Exception{
    return objectMapper.readValue(new File(path), Update.class);
  }
}
