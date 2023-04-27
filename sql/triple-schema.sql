SET ROLE tq_admin;

--CREATE SEQUENCE IF NOT EXISTS public.triple_id_seq
--    AS bigint
--    START WITH 1
--    INCREMENT BY 1
--    NO MINVALUE
--    NO MAXVALUE
--    CACHE 1;


CREATE TABLE IF NOT EXISTS public.triple (
	id 		BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('public.topic_id_seq'::regclass),
	subj_id	BIGINT NOT NULL,
	pred_id	BIGINT NOT NULL,
	obj_id	BIGINT NOT NULL,
	subj_typ 	TEXT NOT NULL,
	obj_typ		TEXT NOT NULL,
	subj_txt	TEXT NOT NULL,
	pred_txt	TEXT NOT NULL,
	obj_txt		TEXT NOT NULL,
	CONSTRAINT fk_node_p FOREIGN KEY(pred_txt) REFERENCES public.node(words)
);

CREATE INDEX IF NOT EXISTS triple_idx ON public.triple (id, subj_id, obj_id, subj_typ, obj_typ);

CREATE TABLE IF NOT EXiSTS public.sentenceids  (
	id 			BIGINT NOT NULL REFERENCES  public.sentence (id),
	sentence_id	BIGINT NOT NULL,
	CONSTRAINT fk_sentence
      FOREIGN KEY(sentence_id) 
	  REFERENCES public.sentence(id)
);
CREATE INDEX IF NOT EXISTS sent_idx ON public.sentenceids (id, sentence_id);

-- Working Triples are those which are not normalized
-- they do not get sentence links
CREATE TABLE IF NOT EXISTS public.working_triple (
	id 		BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('public.topic_id_seq'::regclass),
	subj_id	BIGINT NOT NULL,
	pred_id	BIGINT NOT NULL,
	obj_id	BIGINT NOT NULL,
	subj_typ 	TEXT NOT NULL,
	obj_typ		TEXT NOT NULL,
	norm_id	BIGINT DEFAULT -1
);

CREATE INDEX IF NOT EXISTS wtriple_idx ON public.working_triple (id, subj_id, obj_id, subj_typ, obj_typ);
