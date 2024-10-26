package racingcar.io;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputHandlerTest {
	private InputHandler inputHandler;

	@BeforeEach
	void setUp () {
		inputHandler = new InputHandler();
	}

	@Test
	@DisplayName("입력받은 자동차 이름이 , 으로 나뉜다")
	void splitAndSaveList () {
		// given
		String input = "pobi,woni,juni";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		// when
		List<String> strings = inputHandler.consoleInput();

		// then
		assertThat(strings).hasSize(3);
		assertThat(strings).containsExactly("pobi", "woni", "juni");
	}

}