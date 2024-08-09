package com.banchile.project.reactProject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AbonosRetiros {

    private String name;
    private int percent;
    private List<String> base;

    @Override
    public String toString() {
        return "AbonosRetiros{" +
                "name='" + name + '\'' +
                ", percent=" + percent +
                ", base=" + base +
                '}';
    }
}
