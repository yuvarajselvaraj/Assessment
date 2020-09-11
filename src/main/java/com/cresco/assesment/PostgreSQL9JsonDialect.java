package com.cresco.assesment;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL9Dialect;

import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;

public class PostgreSQL9JsonDialect
extends PostgreSQL9Dialect {

public PostgreSQL9JsonDialect() {
super();
this.registerHibernateType(
    Types.OTHER, JsonNodeBinaryType.class.getName()
);
}
}