package kr.airi.asher.web.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setRemoveAssertJRelatedElementsFromStackTrace;


public class HelloResponseDtoTest {

    @Test
    public void testLombok() {
        //given
        String name = "myName";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
