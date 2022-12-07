package com.root.study.Service;

import com.root.study.dto.MainTableDTO;
import com.root.study.enums.PositionType;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    public List<MainTableDTO> getMainTableData() {
        List<MainTableDTO> dataList = new ArrayList<>();
        String mod;
        for (int i = 1; i < 58; i++) {
            mod = String.valueOf(i%3);

            dataList.add(MainTableDTO.builder()
                    .name("Hero " + i)
                    .position(PositionType.codeOf((mod.equals("0") ? "3" : mod)))
                    .office("Seoul")
                    .age(28)
                    .startDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
                    .salary("￦" + NumberFormat.getInstance().format(10_000_000))
                    .build());
        }

        return dataList;
    }
}
