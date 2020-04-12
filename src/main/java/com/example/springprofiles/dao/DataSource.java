package com.example.springprofiles.dao;

public class DataSource {

    private final String _properties;

    public DataSource(String properties) {
        this._properties = properties;
    }

    public String getProperties() {
        return _properties;
    }
}
