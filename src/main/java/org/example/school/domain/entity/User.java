package org.example.school.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author lmw
 * @since 2024-03-31
 */
@Getter
@Setter
@Data
@TableName("sys_user")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class User {

    @TableId(value = "UserId", type = IdType.ASSIGN_ID)
    private String userId;

    private String userName;

    private String passWord;

    private String nick;

    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    public String getpassWord() {
        return passWord;
    }

    public String getuserName() {
        return userName;
    }
}
