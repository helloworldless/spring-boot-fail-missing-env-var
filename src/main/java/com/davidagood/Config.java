package com.davidagood;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.AssertTrue;

import static org.springframework.util.StringUtils.hasText;

@Validated
@ConfigurationProperties("app")
public class Config {

    private String secret;

    @AssertTrue
    boolean isSecretValid() {
        return hasText(secret) && !(secret.startsWith("${") && secret.endsWith("}"));
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }




}
