package cn.wolfcode.client.website.controller.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Department
{
    private Long id;
    private String name;

    public Department(Long id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
