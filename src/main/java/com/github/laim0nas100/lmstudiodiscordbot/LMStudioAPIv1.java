/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.laim0nas100.lmstudiodiscordbot;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.laim0nas100.uncheckedutils.PassableException;
import com.github.mizosoft.methanol.Methanol;
import com.github.mizosoft.methanol.MutableRequest;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author Lemmin
 */
public class LMStudioAPIv1 extends APITemplate{


    // Common headers for LM Studio API
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String ACCEPT_JSON = "application/json";

    public LMStudioAPIv1() {
    }
    
}
