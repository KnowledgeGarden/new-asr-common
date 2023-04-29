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
	wg_subj_id BIGINT ,
	tr_subj_id BIGINT ,
	wg_pred_id BIGINT NOT NULL,
	wg_obj_id  BIGINT ,
	tr_obj_id  BIGINT ,
	CONSTRAINT triple_wg_subj_fk FOREIGN KEY (wg_subj_id) REFERENCES node(id),
	CONSTRAINT triple_wg_pred_fk FOREIGN KEY (wg_pred_id) REFERENCES node(id),
	CONSTRAINT triple_wg_obj_fk  FOREIGN KEY (wg_obj_id)  REFERENCES node(id),
	CONSTRAINT triple_tr_subj_fk FOREIGN KEY (tr_subj_id) REFERENCES triple(id),
	CONSTRAINT triple_tr_obj_fk  FOREIGN KEY (tr_obj_id)  REFERENCES triple(id)
);

CREATE INDEX IF NOT EXISTS triple_idx ON public.triple (id, wg_subj_id, tr_subj_id,
		wg_pred_id, wg_obj_id, tr_obj_id);
CREATE INDEX IF NOT EXISTS triple_tr_obj_idx ON public.triple(tr_obj_id);
CREATE INDEX IF NOT EXISTS triple_tr_subj_idx ON public.triple(tr_subj_id);

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
	wg_subj_id BIGINT ,
	tr_subj_id BIGINT ,
	wg_pred_id BIGINT NOT NULL,
	wg_obj_id  BIGINT ,
	tr_obj_id  BIGINT ,
	tr_norm_id BIGINT ,
	CONSTRAINT triple_wg_subj_fk FOREIGN KEY (wg_subj_id) REFERENCES node(id),
	CONSTRAINT triple_wg_pred_fk FOREIGN KEY (wg_pred_id) REFERENCES node(id),
	CONSTRAINT triple_wg_obj_fk  FOREIGN KEY (wg_obj_id)  REFERENCES node(id),
	CONSTRAINT triple_tr_subj_fk FOREIGN KEY (tr_subj_id) REFERENCES triple(id),
	CONSTRAINT triple_tr_obj_fk  FOREIGN KEY (tr_obj_id)  REFERENCES triple(id),
	CONSTRAINT triple_tr_norm_fk  FOREIGN KEY (tr_norm_id)  REFERENCES triple(id)

);

CREATE INDEX IF NOT EXISTS wtriple_idx ON public.working_triple (id, wg_subj_id, tr_subj_id,
		wg_pred_id, wg_obj_id, tr_obj_id);
CREATE INDEX IF NOT EXISTS wtriple_tr_obj_idx ON public.working_triple(tr_obj_id);
CREATE INDEX IF NOT EXISTS wtriple_tr_subj_idx ON public.working_triple(tr_subj_id);