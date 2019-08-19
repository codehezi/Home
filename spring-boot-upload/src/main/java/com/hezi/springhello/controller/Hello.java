package com.hezi.springhello.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class Hello {
	
	@RequestMapping("/{page}")
	public String index(@PathVariable String page) {
		return page;
	}

	@RequestMapping("/hello")
	public String demo(MultipartFile file,HttpServletRequest req) {
        String path=req.getServletContext().getRealPath("upload");
		try {
			file.transferTo(new File(path,file.getOriginalFilename()));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(path);
		return "index.html";
	}
	@RequestMapping("/action")
	@ResponseBody
	public String test(MultipartFile file,HttpServletRequest req) throws Exception{
		String path=req.getServletContext().getRealPath("upload");
	    System.out.println(path);
		System.out.println(file);
		System.out.println(file.getOriginalFilename());
		file.transferTo(new File(path,file.getOriginalFilename()));
		return file.getOriginalFilename();
	}
	@RequestMapping("/active")
	@ResponseBody
	public String test(String data,HttpServletRequest req) throws Exception{
            System.out.println(data);
		return "ok";
	}
	
}
