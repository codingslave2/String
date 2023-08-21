package aaa.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadFile {
	
	// 파일 업로드 경로
	private static final String UPLOAD_DIRECTORY = "C:\\Coding\\springworks\\stsMVCProject\\src\\main\\webapp\\views\\up";
	
	// 파일 저장 기능 매소드
	public void saveFile(MultipartFile file) throws IOException{
		// 이미지 파일인지 아닌지 확인하는 매소드
		if(isImageFile(file)) {
			// 업로드 경로 생성
			File uploadDir = new File(UPLOAD_DIRECTORY);
			if(!uploadDir.exists());{
				uploadDir.mkdir();
			}
			
			// 업로드된 원본 파일명 가져오기
			String OriginalFilename = file.getOriginalFilename();
			
			// 중복된 파일명 처리
			File outputFile = new File(uploadDir, OriginalFilename);			
			int counter = 1;
			while(outputFile.exists()) {
				String newFileName = getNewFileName(OriginalFilename, counter);
				outputFile = new File(uploadDir, newFileName);
				counter++;
			}
			
			// 파일 실제로 저장
			
			try (FileOutputStream fos = new FileOutputStream(outputFile)){
				fos.write(file.getBytes());
			}catch(IOException e) {
				e.printStackTrace();
				throw e; // 예외를 다시 던지기
			}
			
		}
	}

	// 업로드된 파일이 이미지 파일인지 확인
	
	private boolean isImageFile(MultipartFile file) {
		String contentType = file.getContentType();		
		return contentType != null && contentType.startsWith("image");
	}
	
	// 중복된 파일명 처리
	
	private String getNewFileName(String originalFileName, int counter) {
		
		int dotIndex = originalFileName.lastIndexOf(".");
		String extension = originalFileName.substring(dotIndex);
		
		return originalFileName.substring(0, dotIndex) + "_" + counter + extension;
		
	}
	
}
