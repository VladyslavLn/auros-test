-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: auros
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `k_pac_k_pac_sets`
--
USE `auros`;
LOCK TABLES `k_pac_k_pac_sets` WRITE;
/*!40000 ALTER TABLE `k_pac_k_pac_sets` DISABLE KEYS */;
INSERT INTO `k_pac_k_pac_sets` VALUES (25,27),(26,27),(27,27),(28,27),(29,28),(30,28),(31,28);
/*!40000 ALTER TABLE `k_pac_k_pac_sets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `k_pac_sets`
--

LOCK TABLES `k_pac_sets` WRITE;
/*!40000 ALTER TABLE `k_pac_sets` DISABLE KEYS */;
INSERT INTO `k_pac_sets` VALUES (27,'Programming languages'),(28,'Spoken language');
/*!40000 ALTER TABLE `k_pac_sets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `k_pacs`
--

LOCK TABLES `k_pacs` WRITE;
/*!40000 ALTER TABLE `k_pacs` DISABLE KEYS */;
INSERT INTO `k_pacs` VALUES (25,'Python','Python is a high-level, interpreted, general-purpose programming language. Its design philosophy emphasizes code readability with the use of significant indentation','23-06-2022'),(26,'Java','Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile.','23-06-2022'),(27,'Go!','Go! is an agent-based programming language in the tradition of logic-based programming languages like Prolog. It was introduced in a 2003 paper by Francis McCabe and Keith Clark.','23-06-2022'),(28,'JavaScript','JavaScript is a high-level, often just-in-time compiled language that conforms to the ECMAScript standard. It has dynamic typing, prototype-based object-orientation, and first-class functions. It is multi-paradigm, supporting event-driven, functional, and imperative programming styles. It has application programming interfaces (APIs) for working with text, dates, regular expressions, standard data structures, and the Document Object Model (DOM).','23-06-2022'),(29,'English','English is a West Germanic language of the Indo-European language family, originally spoken by the inhabitants of early medieval England. It is named after the Angles, one of the ancient Germanic peoples that migrated from Anglia, a peninsula on the Baltic Sea (not to be confused with East Anglia in England), to the area of Great Britain later named after them: England. The closest living relatives of English include Scots, followed by the Low Saxon and Frisian languages. While English is genealogically West Germanic, its vocabulary is also distinctively influenced by Old Norman French and Latin, as well as by Old Norse (a North Germanic language). Speakers of English are called Anglophones.','23-06-2022'),(30,'Polish','Polish is a West Slavic language of the Lechitic group, written in the Latin script. It is spoken primarily in Poland and serves as the native language of the Poles. In addition to being the official language of Poland, it is also used by Polish minorities in other countries. There are over 50 million Polish speakers around the world â it is the sixth-most-spoken language of the European Union. Polish is subdivided into regional dialects and maintains strict TâV distinction pronouns, honorifics and various forms of formalities when addressing individuals.','23-06-2022'),(31,'Ukrainian','Ukrainian is an East Slavic language of the Indo-European language family. It is the native language of about 40 million people and the official state language of Ukraine in Eastern Europe. Written Ukrainian uses the Ukrainian alphabet, a variant of the Cyrillic script. The standard Ukrainian language is regulated by the National Academy of Sciences of Ukraine (NANU; particularly by its Institute for the Ukrainian Language), the Ukrainian language-information fund, and Potebnia Institute of Linguistics. Comparisons are often drawn to Russian, a prominent Slavic language, but there is more mutual intelligibility with Belarusian,Ukrainian\'s closest relative.','23-06-2022');
/*!40000 ALTER TABLE `k_pacs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-23 23:41:53
