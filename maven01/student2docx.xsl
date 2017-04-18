<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0"
                xmlns:w="http://schemas.openxmlformats.org/wordprocessingml/2006/main"
                exclude-result-prefixes="w">
    <xsl:output indent="yes" standalone="yes" encoding="UTF-8" />
    <xsl:param name="docTitle" />
	
    <xsl:template match="/course">
        <w:document 
			xmlns:wpc="http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas"
			xmlns:mc="http://schemas.openxmlformats.org/markup-compatibility/2006"
			xmlns:o="urn:schemas-microsoft-com:office:office"
			xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships"
			xmlns:m="http://schemas.openxmlformats.org/officeDocument/2006/math"
			xmlns:v="urn:schemas-microsoft-com:vml"
			xmlns:wp14="http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing"
			xmlns:wp="http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing"
			xmlns:w10="urn:schemas-microsoft-com:office:word"
			xmlns:w="http://schemas.openxmlformats.org/wordprocessingml/2006/main"
			xmlns:w14="http://schemas.microsoft.com/office/word/2010/wordml"
			xmlns:wpg="http://schemas.microsoft.com/office/word/2010/wordprocessingGroup"
			xmlns:wpi="http://schemas.microsoft.com/office/word/2010/wordprocessingInk"
			xmlns:wne="http://schemas.microsoft.com/office/word/2006/wordml"
			xmlns:wps="http://schemas.microsoft.com/office/word/2010/wordprocessingShape"
			mc:Ignorable="w14 wp14">
            <w:body>
                <w:p w:rsidR="00A5511A" w:rsidRDefault="006B4396">
                    <w:r>
                        <w:t>Tabla Notas</w:t>
                    </w:r>
                </w:p>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396"/>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                    <w:r>
                        <w:t>Curso</w:t>
                    </w:r>
                </w:p>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                    <w:r>
                        <w:t>
                            <xsl:value-of select="name"/>
                        </w:t>
                    </w:r>
                </w:p>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396"/>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                    <w:r>
                        <w:t>Profesor</w:t>
                    </w:r>
                </w:p>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                    <w:r>
                        <w:t>
                            <xsl:value-of select="teacher"/>
                        </w:t>
                    </w:r>


                </w:p>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396"/>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396"/>
                <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396"/>
				
				<xsl:for-each select="students">
					<xsl:apply-templates select="." />
				</xsl:for-each>				
				
                <w:sectPr w:rsidR="006B4396">
                    <w:pgSz w:w="12240" w:h="15840"/>
                    <w:pgMar w:top="1417" w:right="1701" w:bottom="1417" w:left="1701" w:header="708" w:footer="708" w:gutter="0"/>
                    <w:cols w:space="708"/>
                    <w:docGrid w:linePitch="360"/>
                </w:sectPr>
            </w:body>
        </w:document>			
    </xsl:template>
	
	<xsl:template match="students">
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
                            <w:t>Nombre Alumno</w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1765" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                        <w:r>
                            <w:t>Nota 1</w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1766" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                        <w:r>
                            <w:t>Nota 2</w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1766" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                        <w:r>
                            <w:t>Proyecto</w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1766" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006B4396">
                        <w:r>
                            <w:t>Final</w:t>
                        </w:r>
                    </w:p>
                </w:tc>
            </w:tr>
			
			<xsl:for-each select="student">
				<xsl:apply-templates select="." />
			</xsl:for-each>
			</w:tbl>
		</xsl:template>
		
		<xsl:template match="student">
            <w:tr w:rsidR="006B4396" w:rsidTr="006B4396">
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1765" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006C0E75">
                        <w:r>
                            <w:t><xsl:value-of select="name"/></w:t>
                        </w:r>

                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1765" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006C0E75">
                        <w:r>
                            <w:t><xsl:value-of select="hw1"/></w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1766" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006C0E75">
                        <w:r>
                            <w:t><xsl:value-of select="hw2"/></w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1766" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006C0E75">
                        <w:r>
                            <w:t><xsl:value-of select="project"/></w:t>
                        </w:r>
                    </w:p>
                </w:tc>
                <w:tc>
                    <w:tcPr>
                        <w:tcW w:w="1766" w:type="dxa"/>
                    </w:tcPr>
                    <w:p w:rsidR="006B4396" w:rsidRDefault="006C0E75">
                        <w:r>
                            <w:t><xsl:value-of select="final"/></w:t>
                        </w:r>
                        <w:bookmarkStart w:id="0" w:name="_GoBack"/>
                        <w:bookmarkEnd w:id="0"/>
                    </w:p>
                </w:tc>
            </w:tr>
        
	</xsl:template>
</xsl:stylesheet>