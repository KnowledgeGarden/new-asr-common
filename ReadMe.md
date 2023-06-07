# new-asr-common
A common library for the new-asr platform

## Requirements
- JDK 11
- Python 3+
- Maven
- Postgres

## Installing
This is a Maven project with numerous libraries.<br/>
Some dependencies are common and in Maven repositories.<br/>
However, at this time, the new-asr libraries and many TopicQuests libries, e.g.. tq* are  not.<br/>
They must be installed.

### Low level support - evolve very slowly
- git@github.com:topicquests/tq-support.git then
- git@github.com:topicquests/tqos-asr-statistics-client.git
- git@github.com:topicquests/tqks-kafka-support.git
- git@github.com:topicquests/tqks-postgresql-provider.git
- git@github.com:topicquests/tqos-asr-common.git
- git@github.com:KnowledgeGarden/tqos-asr-spacy-driver.git

### Platform -- evolves continuously
- git@github.com:KnowledgeGarden/new-asr-common.git
- git@github.com:KnowledgeGarden/new-asr-document.git
- git@github.com:KnowledgeGarden/new-dictionary.git
- git@github.com:KnowledgeGarden/new-asr-sentence.git
- git@github.com:KnowledgeGarden/new-asr-sentence-agent.git
- git@github.com:KnowledgeGarden/new-asr-expectation-handler-base.git
- git@github.com:KnowledgeGarden/new-asr-statistics.git not used yet but soon

## Database
Instructions and SQL schema are in new-asr-common/sql directory

See the file "schema-notes.txt"

## Building
Command line on each maven repo:</br>
- mvn clean install -DskipTests=true
## Running
When the databases are installed and all repos are installed:<br/>
- Start the Dictionary with its start.sh
- Start new-asr-sentence-agent  (python) with its start.sh

At this point, for the time being, it's required to open new-asr-sentence in an IDE such as Eclipse.<br/>
This allows you to go into the test classpath and open SentenceTestingFramework and ensure that<br/>
"new PredicateImportTest();" is the only line not commented out.

What you will accomplish with that test is to import into dictionary and wordgrams databases all of the predicate types the system will process.

That list predicates is in data/predicates and will be updated  over time.

For the time being, that's the state of the system. It is evolving to make all of those operations seamless.
