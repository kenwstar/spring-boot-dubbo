package com.qishon.uic;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kenwstar on 2016/12/28.
 */
@Data
public class User implements Serializable {
    private Long id;
    private String nick;
    private Date createdAt;
}
