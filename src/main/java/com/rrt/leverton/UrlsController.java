package com.rrt.leverton;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping(value = "/urls", produces = "application/json")
public class UrlsController {

    protected UrlManager manager = new UrlManager();

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<ShortenedUrl> getUrls() {
        return manager.getUrls();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<ShortenedUrl> addUrl(@PathParam("url") String url) {
        return manager.addUrl(url);
    }


    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<ShortenedUrl> deleteUrl(@PathParam("url") String url) {
        return manager.removeUrl(url);
    }


}

