package com.bootcamp;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Staff {
  String id;
  LocalDate joinDate;
}
