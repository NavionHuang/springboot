package com.light.springboot.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.light.springboot.pojo.FileInfo;

/**
 * 文件上传
 * 
 * @author 2018040005
 *
 */
@RestController
@RequestMapping("/file")
public class FileController {
	private String path = "E:\\";

	@PostMapping
	public FileInfo uploda(MultipartFile file) throws Exception {
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		File localFile = new File(path, file.getOriginalFilename());
		file.transferTo(localFile);
		return new FileInfo(localFile.getAbsolutePath());
	}

	@GetMapping("/{id}")
	public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) {
		try {
			InputStream is = new FileInputStream(new File(path, id + ".bmp"));
			OutputStream os = response.getOutputStream();
			response.setContentType("application/x-download");
			response.addHeader("content-Disposition", "attachment;filename=" + id + ".bmp");
			IOUtils.copy(is, os);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
