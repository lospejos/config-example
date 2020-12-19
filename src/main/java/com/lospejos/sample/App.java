package com.lospejos.sample;

import com.typesafe.config.Config;
import io.jooby.Environment;
import io.jooby.Jooby;

public class App  extends Jooby {

    public static final String PARAM_NAME = "param_name";

    {
        final Environment env = getEnvironment();
        final Config conf = env.getConfig();

        get("/param/{"+PARAM_NAME+"}", ctx -> {
            final String paramName = ctx.path(PARAM_NAME).value();
            return conf.getString(paramName);
        });
    }

    public static void main(final String[] args) {
        runApp(args, App::new);
    }
}
