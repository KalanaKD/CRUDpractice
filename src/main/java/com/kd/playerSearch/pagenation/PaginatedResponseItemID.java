package com.kd.playerSearch.pagenation;

import com.kd.playerSearch.dto.PlayerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaginatedResponseItemID {

    List<PlayerDTO> players;
    private long dataCount;

}
