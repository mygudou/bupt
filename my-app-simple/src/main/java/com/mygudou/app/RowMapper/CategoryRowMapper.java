package com.mygudou.app.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mygudou.app.Model.Category;

public class CategoryRowMapper implements RowMapper<Category> {

    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

        Category category = new Category();

        category.setId(rs.getInt("id"));
        category.setCategoryname(rs.getString("name"));

        return category;
    }

}
