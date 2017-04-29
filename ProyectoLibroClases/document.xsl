<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0"
                xmlns:w="http://schemas.openxmlformats.org/wordprocessingml/2006/main"
                exclude-result-prefixes="w">
	<xsl:output indent="yes" standalone="yes" encoding="UTF-8" />
	<xsl:param name="docTitle" />
<xsl:variable name="variable_numero" select="/Colegio/curso/numeroCurso"/>
<xsl:variable name="variable_letra" select="/Colegio/curso/letraCurso"/>

	
	
	
	
	
	<xsl:template match="/Colegio">
		<w:document xmlns:wpc="http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas" xmlns:cx="http://schemas.microsoft.com/office/drawing/2014/chartex" xmlns:cx1="http://schemas.microsoft.com/office/drawing/2015/9/8/chartex" xmlns:cx2="http://schemas.microsoft.com/office/drawing/2015/10/21/chartex" xmlns:cx3="http://schemas.microsoft.com/office/drawing/2016/5/9/chartex" xmlns:cx4="http://schemas.microsoft.com/office/drawing/2016/5/10/chartex" xmlns:cx5="http://schemas.microsoft.com/office/drawing/2016/5/11/chartex" xmlns:cx6="http://schemas.microsoft.com/office/drawing/2016/5/12/chartex" xmlns:cx7="http://schemas.microsoft.com/office/drawing/2016/5/13/chartex" xmlns:cx8="http://schemas.microsoft.com/office/drawing/2016/5/14/chartex" xmlns:mc="http://schemas.openxmlformats.org/markup-compatibility/2006" xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships" xmlns:m="http://schemas.openxmlformats.org/officeDocument/2006/math" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:wp14="http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing" xmlns:wp="http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing" xmlns:w10="urn:schemas-microsoft-com:office:word" xmlns:w="http://schemas.openxmlformats.org/wordprocessingml/2006/main" xmlns:w14="http://schemas.microsoft.com/office/word/2010/wordml" xmlns:w15="http://schemas.microsoft.com/office/word/2012/wordml" xmlns:w16se="http://schemas.microsoft.com/office/word/2015/wordml/symex" xmlns:wpg="http://schemas.microsoft.com/office/word/2010/wordprocessingGroup" xmlns:wpi="http://schemas.microsoft.com/office/word/2010/wordprocessingInk" xmlns:wne="http://schemas.microsoft.com/office/word/2006/wordml" xmlns:wps="http://schemas.microsoft.com/office/word/2010/wordprocessingShape" mc:Ignorable="w14 w15 w16se wp14">
			<w:body>
				<xsl:for-each select="Cursos">
					<xsl:apply-templates select="." />
				</xsl:for-each>
			</w:body>
		</w:document>
	</xsl:template>	

	<xsl:template match="Cursos">

		<xsl:for-each select="Alumno">
			<xsl:apply-templates select="." />
		</xsl:for-each>
	</xsl:template>	

	<xsl:template match="Alumno">
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00A5511A" w:rsidRDefault="00C4339A">
			<w:r>
				<w:t>Informe Semestral</w:t>
			</w:r>
		</w:p>
		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A"/>	
		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A">
			<w:r>
				<w:t>Curso: <xsl:value-of select="$variable_numero"/> Letra: <xsl:value-of select="$variable_letra"/>
				</w:t>
			</w:r>
		</w:p>


		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A">
			<w:r>
				<w:t>Para: <xsl:value-of select="apoderado"/>
				</w:t>
			</w:r>
		</w:p>
		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A"/>
		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A">
			<w:r>
				<w:t>Alumno: <xsl:value-of select="nombre"/>
				</w:t>
			</w:r>
		</w:p>
		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A"/>
		<w:p w:rsidR="00C4339A" w:rsidRDefault="00C4339A"/>
		<w:p w:rsidR="005B3BC7" w:rsidRDefault="005B3BC7"/>

		<xsl:for-each select="calificaciones">
			<xsl:apply-templates select="." />
		</xsl:for-each>	

		<w:p w:rsidR="005B3BC7" w:rsidRDefault="005B3BC7"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9">
			<w:r>
				<w:t>Anotaciones:</w:t>
			</w:r>
		</w:p>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9">
			<w:r>
				<w:t>
					<xsl:value-of select="anotaciones"/>
				</w:t>
			</w:r>
		</w:p>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9">
			<w:r>
				<w:t>Planificación:</w:t>
			</w:r>
		</w:p>
		<xsl:for-each select="notas">
			<xsl:apply-templates select="." />
		</xsl:for-each>		



		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9">
			<w:r>
				<w:t>&lt;Asignatura&gt; : &lt;Planificación&gt;</w:t>
			</w:r>
		</w:p>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9">
			<w:bookmarkStart w:id="0" w:name="_GoBack"/>
			<w:bookmarkEnd w:id="0"/>
		</w:p>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9"/>
		<w:p w:rsidR="00AE7CF1" w:rsidRDefault="00AE7CF1">
			<w:r>
				<w:lastRenderedPageBreak/>
				<w:t/>
			</w:r>
			<w:bookmarkStart w:id="0" w:name="_GoBack"/>
			<w:bookmarkEnd w:id="0"/>
		</w:p>
		<w:sectPr w:rsidR="00222AA9" w:rsidSect="00222AA9">
			<w:pgSz w:w="12240" w:h="15840" w:code="1"/>
			<w:pgMar w:top="1417" w:right="1701" w:bottom="1417" w:left="1701" w:header="708" w:footer="708" w:gutter="0"/>
			<w:cols w:space="708"/>
			<w:docGrid w:linePitch="360"/>
		</w:sectPr>	

	</xsl:template>

	<xsl:template match="calificaciones">
		<w:tbl>
			<w:tblPr>
				<w:tblStyle w:val="Tablaconcuadrcula"/>
				<w:tblW w:w="0" w:type="auto"/>
				<w:tblLook w:val="04A0" w:firstRow="1" w:lastRow="0" w:firstColumn="1" w:lastColumn="0" w:noHBand="0" w:noVBand="1"/>
			</w:tblPr>
			<w:tblGrid>
				<w:gridCol w:w="1765"/>
				<w:gridCol w:w="1765"/>
				<w:gridCol w:w="1766"/>
				<w:gridCol w:w="1766"/>
				<w:gridCol w:w="1766"/>
			</w:tblGrid>
			<w:tr w:rsidR="006B4396" w:rsidTr="006B4396">
				<w:tc>
					<w:tcPr>
						<w:tcW w:w="1765" w:type="dxa"/>
					</w:tcPr>
					<w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
						<w:r>
							<w:t>
								<xsl:value-of select="asignatura"/>
							</w:t>
						</w:r>
					</w:p>
				</w:tc>
				<xsl:for-each select="notas">
					<xsl:apply-templates select="." />
				</xsl:for-each>
			</w:tr>


		</w:tbl>
	</xsl:template>

	<xsl:template match="notas">
		<w:tc>
			<w:tcPr>
				<w:tcW w:w="1471" w:type="dxa"/>
			</w:tcPr>
			<w:p w:rsidR="00222AA9" w:rsidRDefault="00222AA9" w:rsidP="00222AA9">
				<w:r>
					<w:t>
						<xsl:value-of select="/notas"/>
					</w:t>
				</w:r>
			</w:p>
		</w:tc>
	</xsl:template>	

</xsl:stylesheet>