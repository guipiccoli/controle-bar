package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



public class Relatorios {

	private ArrayList<Cliente> listaClienteDia;
	private Date data = null;

	private void criaArquivo() {
		data = new Date();
//		FileAttribute<Date> atributo;
//		Files.createFile("src/persistence/");
		
//		String path = "C:" + File.separator + "\\Users\\fndma\\Desktop\\sei la\\eclipse-workspace\\controle-bar\\src";
//		File f = new File(path);
//		f.getParentFile().mkdirs(); 
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Path path = Paths.get("C:" + File.separator + "\\Users\\fndma\\Desktop\\sei la\\eclipse-workspace\\controle-bar\\src\\teste");

        try {
			Files.createDirectories(path.getParent());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public void registraEntrada(Cliente cli) {
		if(listaClienteDia.isEmpty()) {
			criaArquivo();
			return;
		}
		if(!(listaClienteDia.contains(cli))) {
			
			Path file = Paths.get("teste.txt");
			List<String> lines = Arrays.asList(cli.getNome());
					
			try {
				Files.write(file, lines, Charset.forName("UTF-8"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void encerraDia() {
		data=null;
	}

}
