import { Component, ElementRef, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { Libro } from '../../model/libro.model';
import { Autor } from '../../model/autor.model';
import { Categoria } from '../../model/categoria.model';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { LibroService } from '../../services/libro';
import { AutorService } from '../../services/autor';
import { CategoriaService } from '../../services/categoria';
import { MatDialog } from '@angular/material/dialog';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-libro',
  standalone: false,
  templateUrl: './libro.html',
  styleUrl: './libro.css'
})
export class LibroComponent implements OnInit {

  libros: Libro[] = [];
  autores: Autor[] = [];
  categorias: Categoria[] = [];
  libro: Libro = {} as Libro;
  editar: boolean = false;
  idEditar: number | null = null;
  dataSource!: MatTableDataSource<Libro>;
  selectedFile!: File;
  imagenPreview: string = "";
  libroSeleccionado: Libro | null = null;

  mostrarColumnas: String[] = ['detalles','idLibro','titulo','editarial','edicion','idioma','fechaPublicacion','numEjemplares','precio','autor','categoria','acciones']

  @ViewChild('formularioLibro') formularioLibro!: ElementRef;
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  @ViewChild('modalLibro') modalLibro!: TemplateRef<any>;
  @ViewChild('modalDetalles') modalDetalles!: TemplateRef<any>;


  constructor(
    private libroService: LibroService,
    private autorService: AutorService,
    private categoriaService: CategoriaService,
    private dialog: MatDialog,
    private http: HttpClient
  ){}

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
}
