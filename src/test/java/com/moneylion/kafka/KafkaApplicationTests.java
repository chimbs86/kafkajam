package com.moneylion.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;

	@Test
	public void contextLoads() {
		System.out.println("chimbs rocks");
		kafkaTemplate.send("chimbs","chimbs rocks");
	}

}
